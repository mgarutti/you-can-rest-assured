package helpers;

import client.RestAssuredClient;
import config.APIConfigs;

public class FakeStoreHelper extends RestAssuredClient {

    public FakeStoreHelper(String baseUrl) {
        super(APIConfigs.FakeSore.BASE_URL);
    }

}
