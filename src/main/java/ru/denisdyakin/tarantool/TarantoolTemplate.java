package ru.denisdyakin.tarantool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tarantool.TarantoolConnection16;
import org.tarantool.TarantoolConnection16Impl;

import java.io.IOException;

/**
 * Created by ddyakin on 22.06.16.
 */
public class TarantoolTemplate {
    private static final Logger LOGGER = LoggerFactory.getLogger("STDOUT");

    private TarantoolConnection16 connection16;

    private String host;
    private String port;

    public TarantoolTemplate(String host, String port)
    {
        this.host = host;
        this.port = port;
        LOGGER.info("Tarantool configuration set host: " + this.host + " port: " + this.port);
    }

    public void connect(String username, String pass)
    {
        try {
            connection16 = new TarantoolConnection16Impl(this.host, Integer.parseInt(this.port));
            LOGGER.info("Tarantool connection is open: " + this.host + ":" + this.port);
        } catch (IOException e) {
            LOGGER.error("Connection is failed for URI: " + this.host + ":" + this.port);
            e.printStackTrace();
        }
        connection16.auth(username, pass);
        LOGGER.info("With auth: " + username + ":" + pass);
    }

    public TarantoolConnection16 getConnection16() {
        return connection16;
    }
}
