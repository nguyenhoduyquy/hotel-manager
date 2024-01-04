package com.hotel.repository;

import com.hotel.model.Hotel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface HotelRepository extends ElasticsearchRepository<Hotel, String> {
}
