package click.isreal.topbar.domain;

import net.minecraft.util.Formatting;
import org.apache.commons.lang3.StringUtils;

public enum MixelWorld {
    HUB(MixelWorldType.LOBBY, "", Formatting.WHITE),
    SPAWN_1(MixelWorldType.SPAWN, "1", Formatting.WHITE),
    SPAWN_2(MixelWorldType.SPAWN, "2", Formatting.WHITE),
    SPAWN_3(MixelWorldType.SPAWN, "3", Formatting.WHITE),
    SPAWN_4(MixelWorldType.SPAWN, "4", Formatting.WHITE),
    KFFA(MixelWorldType.KFFA, "", Formatting.AQUA),
    FARMWORLD_1(MixelWorldType.FARMWORLD, "1", Formatting.GRAY),
    FARMWORLD_2(MixelWorldType.FARMWORLD, "2", Formatting.GRAY),
    FARMWORLD_3(MixelWorldType.FARMWORLD, "3", Formatting.GRAY),
    FARMWORLD_4(MixelWorldType.FARMWORLD, "4", Formatting.GRAY),
    SMALL_FLORA(MixelWorldType.SMALL_CB, "Flora", Formatting.GREEN),
    SMALL_AQUA(MixelWorldType.SMALL_CB, "Aqua", Formatting.AQUA),
    SMALL_VULKAN(MixelWorldType.SMALL_CB, "Vulkan", Formatting.RED),
    SMALL_DONNER(MixelWorldType.SMALL_CB, "Donner", Formatting.GOLD),
    BIG_FLORA(MixelWorldType.BIG_CB, "Flora", Formatting.WHITE),
    BIG_AQUA(MixelWorldType.BIG_CB, "Aqua", Formatting.WHITE),
    BIG_VULKAN(MixelWorldType.BIG_CB, "Vulkan", Formatting.WHITE),
    BIG_DONNER(MixelWorldType.BIG_CB, "Donner", Formatting.WHITE),
    EVENT(MixelWorldType.EVENT, "", Formatting.WHITE),
    OTHER(MixelWorldType.OTHER, "", Formatting.RED);

    public static MixelWorld findWorld(String text){
        if(StringUtils.isBlank(text)) return OTHER;
        if ( text.matches(".*Flora Klein.*") )
        {
            return MixelWorld.SMALL_FLORA;
        }
        else if ( text.matches(".*Aqua Klein.*") )
        {
            return MixelWorld.SMALL_AQUA;
        }
        else if ( text.matches(".*Vulkan Klein.*") )
        {
            return MixelWorld.SMALL_VULKAN;
        }
        else if ( text.matches(".*Donner Klein.*") )
        {
            return MixelWorld.SMALL_DONNER;
        }
        else if ( text.matches(".*Flora Groß.*") )
        {
            return MixelWorld.BIG_FLORA;
        }
        else if ( text.matches(".*Aqua Groß.*") )
        {
            return MixelWorld.BIG_AQUA;
        }
        else if ( text.matches(".*Vulkan Groß.*") )
        {
            return MixelWorld.BIG_VULKAN;
        }
        else if ( text.matches(".*Donner Groß.*") )
        {
            return MixelWorld.BIG_DONNER;
        }
        else if ( text.matches(".*Farmwelt 1.*") )
        {
            return MixelWorld.FARMWORLD_1;
        }
        else if ( text.matches(".*Farmwelt 2.*") )
        {
            return MixelWorld.FARMWORLD_2;
        }
        else if ( text.matches(".*Farmwelt 3.*") )
        {
            return MixelWorld.FARMWORLD_3;
        }
        else if ( text.matches(".*Farmwelt 4.*") )
        {
            return MixelWorld.FARMWORLD_4;
        }
        else if ( text.matches(".*Spawn 1.*") )
        {
            return MixelWorld.SPAWN_1;
        }
        else if ( text.matches(".*Spawn 2.*") )
        {
            return MixelWorld.SPAWN_2;
        }
        else if ( text.matches(".*Spawn 3.*") )
        {
            return MixelWorld.SPAWN_3;
        }
        else if ( text.matches(".*Spawn 4.*") )
        {
            return MixelWorld.SPAWN_4;
        }else{
            return OTHER;
        }
    }

    private final MixelWorldType type;
    private final String subtype;
    private final Formatting formatting;

    MixelWorld(MixelWorldType type, String subtype, Formatting formatting){
        this.type = type;
        this.subtype = subtype;
        this.formatting = formatting;
    }

    public MixelWorldType getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    public Formatting getFormatting() {
        return formatting;
    }
}
