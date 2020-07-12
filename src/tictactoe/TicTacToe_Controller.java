package tictactoe;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class TicTacToe_Controller {
	private TicTacToe_Model model;
	private TicTacToe_View view;

	public TicTacToe_Controller(TicTacToe_Model model, TicTacToe_View view) {
		this.model = model;
		this.view = view;
		// "abonniert" die Buttons und setz diese auf Aktion wenn ein Button gedrückt wird
		for (int col = 0; col < view.buttons.length; col++) {
			for (int row = 0; row < view.buttons[0].length; row++) {
				view.buttons[col][row].setOnAction(this::buttonClick);
			}
		}
	}
	private void buttonClick(ActionEvent e) {
		// Find the button (Auf welchen Button hat der User gedrückt?)
	}
}
