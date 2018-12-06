
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Karl Odukwe
 */
public class UserAccountEdit {

	@FXML
	Button cancelButton;
	@FXML
	Button confirmButton;
	@FXML
	TextField userNameTextField;
	@FXML
	TextField firstNameTextField;
	@FXML
	TextField lastNameTextField;
	@FXML
	TextField addressTextField;
	@FXML
	TextField postcodeTextField;
	@FXML
	TextField phoneNumberTextField;
	@FXML
	TextField fineBalanceTextField;
	@FXML
	TextField profileImageTextField;

	User editedUserProfile;

	
	/**
	 * Set the properties of the User. Changes to the user are stored here
	 */
	public void setUserforEditing(User userToEdit) {
		this.editedUserProfile = userToEdit;

		userNameTextField.setText(editedUserProfile.getUsername());
		firstNameTextField.setText(editedUserProfile.getFirstName());
		lastNameTextField.setText(editedUserProfile.getLastName());
		addressTextField.setText(editedUserProfile.getAddressLine());
		postcodeTextField.setText(editedUserProfile.getPostcode());
		phoneNumberTextField.setText(editedUserProfile.getPhoneNumber());
        fineBalanceTextField.setText(Double.toString(editedUserProfile.getFineBalance()));

	}

	private void handleConfirmButtonAction() {
	  //countryBeingEdited.setName(nameTextField.getText());
		editedUserProfile.setUsername(userNameTextField.getText());
		editedUserProfile.setFirstName(firstNameTextField.getText());
		editedUserProfile.setLastName(lastNameTextField.getText());
		editedUserProfile.setPostcode(postcodeTextField.getText());
		editedUserProfile.setAddressLine(addressTextField.getText());
		editedUserProfile.setPhoneNumber(phoneNumberTextField.getText());

	}

}
