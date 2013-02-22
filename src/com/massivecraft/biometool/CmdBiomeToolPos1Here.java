package com.massivecraft.biometool;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;

public class CmdBiomeToolPos1Here extends BiomeToolCommand
{
	public CmdBiomeToolPos1Here()
	{
		super();
		this.addAliases("here");
		this.addRequirements(new ReqHasPerm(Permission.POS1_HERE.node));
		this.addRequirements(ReqIsPlayer.get());
	}
	
	@Override
	public void perform()
	{
		pme.setX1(me.getLocation().getBlockX());
		pme.setZ1(me.getLocation().getBlockZ());
		msg("<i>DONE");
	}
}