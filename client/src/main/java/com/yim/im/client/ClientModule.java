package com.yim.im.client;

import com.google.inject.AbstractModule;
import com.yim.im.client.context.MemoryRelationCache;
import com.yim.im.client.context.RelationCache;

/**
 * Date: 2019-07-03
 * Time: 16:43
 *
 * @author yrw
 */
public class ClientModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RelationCache.class).to(MemoryRelationCache.class);
    }
}