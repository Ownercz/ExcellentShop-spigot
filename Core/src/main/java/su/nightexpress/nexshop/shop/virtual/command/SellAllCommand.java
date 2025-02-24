package su.nightexpress.nexshop.shop.virtual.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import su.nexmedia.engine.api.command.CommandResult;
import su.nexmedia.engine.api.command.GeneralCommand;
import su.nightexpress.nexshop.ExcellentShop;
import su.nightexpress.nexshop.shop.virtual.VirtualShopModule;
import su.nightexpress.nexshop.shop.virtual.config.VirtualLang;
import su.nightexpress.nexshop.shop.virtual.config.VirtualPerms;

public class SellAllCommand extends GeneralCommand<ExcellentShop> {

    private final VirtualShopModule module;

    public SellAllCommand(@NotNull VirtualShopModule module, @NotNull String[] aliases) {
        super(module.plugin(), aliases, VirtualPerms.COMMAND_SELL_ALL);
        this.setDescription(plugin.getMessage(VirtualLang.COMMAND_SELL_ALL_DESC));
        this.setUsage(plugin.getMessage(VirtualLang.COMMAND_SELL_ALL_USAGE));
        this.setPlayerOnly(true);
        this.module = module;
    }

    @Override
    protected void onExecute(@NotNull CommandSender sender, @NotNull CommandResult result) {
        Player player = (Player) sender;
        this.module.getSellMenu().sellAll(player);
    }
}
