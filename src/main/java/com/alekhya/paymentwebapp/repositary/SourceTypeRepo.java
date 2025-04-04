package com.alekhya.paymentwebapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alekhya.paymentwebapp.entities.SourceTypeEntity;

public interface SourceTypeRepo extends JpaRepository<SourceTypeEntity,Integer> {

}
