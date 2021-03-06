package com.lts.core.spi;

/**
 * @author Robert HG (254963746@qq.com) on 12/27/15.
 */
public interface SpiExtensionKey {

    String FAIL_STORE = "job.fail.store";

    String LOADBALANCE = "loadbalance";

    String EVENT_CENTER = "event.center";

    String JDBC_DATASOURCE_PROVIDER = "jdbc.datasource.provider";

    String REMOTING = "lts.remoting";

    String REMOTING_SERIALIZABLE_DFT = "lts.remoting.serializable.default";

    String ZK_CLIENT_KEY = "zk.client";

    String JOB_LOGGER = "job.logger";

    String LTS_LOGGER = "lts.logger";

    String JOB_QUEUE = "job.queue";

    String LTS_JSON = "lts.json";

    String ACCESS_DB = "lts.admin.access.db";
}
