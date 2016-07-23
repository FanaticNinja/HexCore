package org.hexcraft.util;

public class PlayerCooldown {

	private long startTime;
	private String playerName;
	private String cooldownName;
	private long lengthInMillis;
	private long endTime;
	 
	PlayerCooldown(String cooldownName, String player, long lengthInMillis){
		this.cooldownName = cooldownName;
		this.startTime = System.currentTimeMillis();
		this.playerName = player;
		this.lengthInMillis = lengthInMillis;
		this.endTime = startTime + this.lengthInMillis;
	}
	 
	@SuppressWarnings("unused")
	private PlayerCooldown(){
		
	}
	 
	public boolean isOver(){
		return endTime < System.currentTimeMillis();
	}
	 
	public int getTimeLeft(){
		return (int)(endTime - System.currentTimeMillis());
	}
	 
	public String getPlayerName(){
		return playerName;
	}
	 
	public String getCooldownName(){
		return cooldownName;
	}
	public void reset(){
		startTime = System.currentTimeMillis();
		endTime = startTime + lengthInMillis;
	}
	
}
