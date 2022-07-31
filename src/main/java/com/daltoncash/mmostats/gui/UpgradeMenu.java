package com.daltoncash.mmostats.gui;

import com.daltoncash.mmostats.MmoStatsMod;

import net.minecraft.advancements.Advancement;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;


public class UpgradeMenu extends Screen{

	//@SuppressWarnings("unused")
	private final ResourceLocation texture = new ResourceLocation(MmoStatsMod.MODID, "textures/gui/test_image.png");
	public UpgradeMenu(Component p_96550_) {super(p_96550_);}
	
	@Override
	public final void init() {
		addRenderableWidget(new Button(100,100,100,100, Component.selector(null, null), UpgradeMenu::onPress));
		addRenderableWidget(new ImageButton(50, 50, 50, 50, 50, 50, 50, texture, 20, 20, UpgradeMenu::onPress));
	}

	private static void onPress(Button button) {
		
	}
	@Override
	public boolean isPauseScreen() {
		return false;
	}
	
	
}