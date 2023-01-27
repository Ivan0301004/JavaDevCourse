package functionalProgramming;

import java.util.List;

public class Assets {
    public enum assetType {BOND, STOCK};
    private final assetType type;
    private final int value;

    public Assets(final assetType type, final int value) {
        this.type = type;
        this.value = value;
    }

    public assetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public static int totalAssetsValues(final List<Assets> assets) {
        return assets.stream()
            .mapToInt(Assets::getValue)
            .sum();
    }

}
