package com.sava.orderservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 15.2.24.
 */
public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {
}
