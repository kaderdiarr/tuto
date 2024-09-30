import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.sql.*;

public class ResultatController {
    @FXML
    private TextField matriculeField;
    @FXML
    private Label resultatLabel;
    @FXML
    private Button detailsButton;

    @FXML
    private void handleSearch(ActionEvent event) {
        String matricule = matriculeField.getText();
        if (matricule != null && !matricule.isEmpty()) {
            try (Connection conn = DatabaseConnection.getConnection()) {
                String query = "SELECT moyenne FROM etudiants WHERE matricule = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, matricule);
                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    double moyenne = rs.getDouble("moyenne");
                    if (moyenne >= 10) {
                        resultatLabel.setText("Succès");
                    } else {
                        resultatLabel.setText("Échec");
                    }
                    detailsButton.setVisible(true);
                } else {
                    resultatLabel.setText("Matricule introuvable.");
                    detailsButton.setVisible(false);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            resultatLabel.setText("Veuillez entrer un matricule.");
        }
    }

    @FXML
    private void handleShowDetails(ActionEvent event) {
        // Transition vers l'écran des détails de l'étudiant.
    }
}
