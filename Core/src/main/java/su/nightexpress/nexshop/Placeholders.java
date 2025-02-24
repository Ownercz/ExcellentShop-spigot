package su.nightexpress.nexshop;

import su.nightexpress.nexshop.api.shop.type.TradeType;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Placeholders extends su.nexmedia.engine.utils.Placeholders {

    public static final String URL_WIKI               = "https://github.com/nulli0n/ExcellentShop-spigot/wiki/";
    public static final String URL_WIKI_PLACEHOLDERS  = URL_WIKI + "Internal-Placeholders";
    public static final String URL_WIKI_PRODUCT_STOCK = URL_WIKI + "Product-Stock-Feature";

    public static final String EDITOR_VIRTUAL_TITLE = "Virtual Shop Editor";

    public static final String GENERIC_NAME     = "%name%";
    public static final String GENERIC_ITEM     = "%item%";
    public static final String GENERIC_TOTAL    = "%total%";
    public static final String GENERIC_LORE     = "%lore%";
    public static final String GENERIC_AMOUNT   = "%amount%";
    public static final String GENERIC_UNITS    = "%units%";
    public static final String GENERIC_TYPE     = "%type%";
    public static final String GENERIC_TIME     = "%time%";
    public static final String GENERIC_PRICE    = "%price%";
    public static final String GENERIC_BALANCE  = "%balance%";
    public static final String GENERIC_DISCOUNT = "%discount%";
    public static final String GENERIC_TAX      = "%tax%";

    public static final String CURRENCY_NAME = "%currency_name%";
    public static final String CURRENCY_ID   = "%currency_id%";

    public static final String SHOP_ID              = "%shop_id%";
    public static final String SHOP_NAME            = "%shop_name%";
    public static final String SHOP_BUY_ALLOWED     = "%shop_buy_allowed%";
    public static final String SHOP_SELL_ALLOWED    = "%shop_sell_allowed%";

    public static final String PRODUCT_HANDLER = "%product_handler%";
    public static final String PRODUCT_PRICE_TYPE               = "%product_price_type%";
    public static final String PRODUCT_PRICE_BUY                = "%product_price_buy%";
    public static final String PRODUCT_PRICE_BUY_FORMATTED      = "%product_price_buy_formatted%";
    public static final String PRODUCT_PRICE_SELL               = "%product_price_sell%";
    public static final String PRODUCT_PRICE_SELL_FORMATTED     = "%product_price_sell_formatted%";
    public static final String PRODUCT_PRICE_SELL_ALL           = "%product_price_sell_all%";
    public static final String PRODUCT_PRICE_SELL_ALL_FORMATTED = "%product_price_sell_all_formatted%";

    public static final String PRODUCT_PRICER_BUY_MIN              = "%product_pricer_buy_min%";
    public static final String PRODUCT_PRICER_BUY_MAX              = "%product_pricer_buy_max%";
    public static final String PRODUCT_PRICER_SELL_MIN             = "%product_pricer_sell_min%";
    public static final String PRODUCT_PRICER_SELL_MAX             = "%product_pricer_sell_max%";
    public static final String PRODUCT_PRICER_FLOAT_REFRESH_DAYS   = "%product_pricer_float_refresh_days%";
    public static final String PRODUCT_PRICER_FLOAT_REFRESH_TIMES  = "%product_pricer_float_refresh_times%";
    public static final String PRODUCT_PRICER_DYNAMIC_INITIAL_BUY  = "%product_pricer_dynamic_initial_buy%";
    public static final String PRODUCT_PRICER_DYNAMIC_INITIAL_SELL = "%product_pricer_dynamic_initial_sell%";
    public static final String PRODUCT_PRICER_DYNAMIC_STEP_BUY     = "%product_pricer_dynamic_step_buy%";
    public static final String PRODUCT_PRICER_DYNAMIC_STEP_SELL    = "%product_pricer_dynamic_step_sell%";

    public static final String PRODUCT_DISCOUNT_ALLOWED  = "%product_discount_allowed%";
    public static final String PRODUCT_DISCOUNT_AMOUNT   = "%product_discount_amount%";
    public static final String PRODUCT_ITEM_META_ENABLED = "%product_item_meta_enabled%";
    public static final String PRODUCT_PREVIEW_NAME      = "%product_preview_name%";
    public static final String PRODUCT_PREVIEW_LORE      = "%product_preview_lore%";
    public static final String PRODUCT_CURRENCY          = "%product_currency%";

    public static final Function<TradeType, String> PRODUCT_STOCK_AMOUNT_INITIAL = type -> "%product_stock_global_" + type.getLowerCase() + "_amount_initial%";
    public static final Function<TradeType, String> PRODUCT_STOCK_AMOUNT_LEFT    = type -> "%product_stock_global_" + type.getLowerCase() + "_amount_left%";
    public static final Function<TradeType, String> PRODUCT_STOCK_RESTOCK_TIME   = type -> "%product_stock_global_" + type.getLowerCase() + "_restock_time%";
    public static final Function<TradeType, String> PRODUCT_STOCK_RESTOCK_DATE   = type -> "%product_stock_global_" + type.getLowerCase() + "_restock_date%";

    public static final Function<TradeType, String> PRODUCT_LIMIT_AMOUNT_INITIAL = type -> "%product_stock_player_" + type.getLowerCase() + "_amount_initial%";
    public static final Function<TradeType, String> PRODUCT_LIMIT_AMOUNT_LEFT    = type -> "%product_stock_player_" + type.getLowerCase() + "_amount_left%";
    public static final Function<TradeType, String> PRODUCT_LIMIT_RESTOCK_TIME   = type -> "%product_stock_player_" + type.getLowerCase() + "_restock_time%";
    public static final Function<TradeType, String> PRODUCT_LIMIT_RESTOCK_DATE   = type -> "%product_stock_player_" + type.getLowerCase() + "_restock_date%";

    public static final String DISCOUNT_CONFIG_AMOUNT   = "%discount_amount%";
    public static final String DISCOUNT_CONFIG_DURATION = "%discount_duration%";
    public static final String DISCOUNT_CONFIG_DAYS     = "%discount_days%";
    public static final String DISCOUNT_CONFIG_TIMES    = "%discount_times%";
}
