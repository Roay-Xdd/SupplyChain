package com.qtummatrix.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "redis-service",fallback = WSY_RedisFallback.class)
public interface WSY_RedisService {


}
