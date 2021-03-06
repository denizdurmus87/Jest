package io.searchbox.client;


import io.searchbox.Action;

import java.io.IOException;


/**
 * @author Dogukan Sonmez
 */


public interface JestClient {

    JestResult execute(Action clientRequest) throws IOException;

    <T> T executeAsync(Action clientRequest);

    void shutdownClient();
}
