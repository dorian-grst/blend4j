package com.github.jmchilton.blend4j.galaxy;

import com.sun.jersey.api.client.ClientResponse;

/**
 * AMPPD extension
 * APIs for history and history contents.
 */
public interface HistoryClient {
  ClientResponse setAsCurrent(String string);
}
