package com.okcoin.commons.okex.open.api.test.swap;

import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.enums.I18nEnum;

public class SwapBaseTest {
    public APIConfiguration config;

    public APIConfiguration config() {
        APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.okex.com");
        config.setApiKey("5ebfabdf-510c-4d87-93c0-e2029d437048");
        config.setSecretKey("6D5996F7C568C18DC4AEAEC91674555A");

        config.setPassphrase("chenchen051016");
        config.setPrint(true);
        config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);

        return config;
    }

    int from = 0;
    int to = 0;
    int limit = 20;

    String instrument_id = "BTC-USD-SWAP";
}
