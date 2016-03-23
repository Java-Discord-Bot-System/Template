package com.almightyalpaca.discord.bot.plugin.template;

import com.almightyalpaca.discord.bot.system.command.AbstractCommand;
import com.almightyalpaca.discord.bot.system.command.annotation.Command;
import com.almightyalpaca.discord.bot.system.events.CommandEvent;
import com.almightyalpaca.discord.bot.system.exception.PluginLoadingException;
import com.almightyalpaca.discord.bot.system.exception.PluginUnloadingException;
import com.almightyalpaca.discord.bot.system.plugins.Plugin;
import com.almightyalpaca.discord.bot.system.plugins.PluginInfo;

public class TemplatePlugin extends Plugin {

	class TemplateCommand extends AbstractCommand {

		public TemplateCommand() {
			super("template", "Only a template.", "");
		}

		@Command(dm = true, guild = true, async = true)
		private void onCommand(final CommandEvent event) {
			event.sendMessage("This is only a TEMPLATE!");
		}
	}

	private static final PluginInfo INFO = new PluginInfo("com.almightyalpaca.discord.bot.plugin.template", "1.0.0", "Almighty Alpaca", "Template Plugin", "A plugin template.");

	public TemplatePlugin() {
		super(TemplatePlugin.INFO);
	}

	@Override
	public void load() throws PluginLoadingException {
		this.registerCommand(new TemplateCommand());
	}

	@Override
	public void unload() throws PluginUnloadingException {}
}
