package Game;

import java.awt.Color;

public class Player {

	private String playerName;
	private String position;
	private int currentStep;
	private double playerTotalMoney;
	private String currentMajor;
	private String yearInSchool="Freshman";
	private Color playerColor;

	public Player(String playerName, String position, int currentStep, double playerTotalMoney, String currentMajor,
			String yearInSchool) {
		this.playerName = playerName;
		this.position = position;
		this.playerTotalMoney = playerTotalMoney;
		this.currentMajor = currentMajor;
		this.yearInSchool = "Freshman";
		this.currentStep = currentStep;
		setPlayerColor(playerName);

	}

	public String getYearInSchool() {
		return yearInSchool;
	}

	public void setYearInSchool(String yearInSchool) {
		this.yearInSchool = yearInSchool;
	}

	public String getCurrentMajor() {
		return currentMajor;
	}

	public void setCurrentMajor(String currentMajor) {
		this.currentMajor = currentMajor;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getPlayerTotalMoney() {
		return playerTotalMoney;
	}

	public void setPlayerTotalMoney(double playerTotalMoney) {
		this.playerTotalMoney = playerTotalMoney;
	}

	public int getCurrentStep() {
		return currentStep;
	}

	public void setCurrentStep(int currentStep) {
		this.currentStep = currentStep;
	}

	public Color getPlayerColor() {
		return playerColor;
	}

	public void setPlayerColor(String playerName) {
		if (playerName.equals("Player1"))
			playerColor = Color.cyan;
		else if (playerName.equals("Player2"))
			playerColor = Color.MAGENTA;
		else if (playerName.equals("Player3"))
			playerColor = Color.YELLOW;
		else
			playerColor = Color.BLACK;

	}

	@Override
	public String toString() {
		return "Player Name=" + getPlayerName() + ",    Position=" + getPosition() + ",    Player TotalMoney="
				+ playerTotalMoney + ",    Current Major=" + getCurrentMajor() + ",    Year In School=" + getYearInSchool();
	}
}
