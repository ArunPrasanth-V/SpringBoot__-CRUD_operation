package com.example.DB;

import org.springframework.data.repository.CrudRepository;

import com.example.parcel.I_transfer_data_toDB;

public interface Store_data extends CrudRepository<I_transfer_data_toDB,Long> {

}
