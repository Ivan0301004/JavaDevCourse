package functionalProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainAss {
    public static void main(String[] args) {
        final List<Assets> asset = Arrays.asList(
            new Assets(Assets.assetType.BOND, 1000),
            new Assets(Assets.assetType.BOND, 2000),
            new Assets(Assets.assetType.STOCK, 3000),
            new Assets(Assets.assetType.STOCK, 4300)
        );

        System.out.println("Total of assets : " + totalAssetsValues(asset));

    }

    public static int totalAssetsValues(final List<Assets> assets) {
        return assets.stream()
            .mapToInt(Assets::getValue)
            .sum();
    }
}
