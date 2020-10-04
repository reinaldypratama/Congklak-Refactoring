package com.congklak.core;

public class GameState implements Cloneable{
	protected Player player;
	protected Player computer;
	
	public GameState(Player player, Player computer) {
		this.player = player;
		this.computer = computer;
		this.player.setOpponent(computer);
		this.computer.setOpponent(player);
	}
	
	protected GameState clone() {
		return new GameState(player.clone(), computer.clone());
	}
}
