package com.cc.worldcupremind.model;

public class PlayerStatistics {
	
	public enum STATISTICS_TYPE{
		STATISTICS_GOAL,
		STATISTICS_ASSIST
	}
	
	private int position;
	private String playerName;
	private String playerEngName;
	private String playerTeamCode;
	private int count;
	private String ext;
	private STATISTICS_TYPE type;
	
	public PlayerStatistics(int pos, String engName, String name, String team, int count, STATISTICS_TYPE type){
		this.position = pos;
		this.playerEngName = engName;
		this.playerName = name;
		this.playerTeamCode = team;
		this.count = count;
		this.type = type;
		this.ext = null;
	}
	
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @return the playerEngName
	 */
	public String getPlayerEngName() {
		return playerEngName;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	
	/**
	 * @return the playerTeamCode
	 */
	public String getPlayerTeamCode() {
		return playerTeamCode;
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * @return the type
	 */
	public STATISTICS_TYPE getType() {
		return type;
	}
	
	/**
	 * @param ext the ext to set
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}
	
	public int getPenGoalCount(){
		if(ext == null || ext.length() == 0 || type == STATISTICS_TYPE.STATISTICS_ASSIST){
			return 0;
		}
		try{
			return Integer.parseInt(ext);
		}catch(NumberFormatException e){
			return 0;
		}
	}
}
