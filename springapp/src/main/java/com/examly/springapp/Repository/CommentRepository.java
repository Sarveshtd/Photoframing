package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.CommentModel;

@Repository
public interface CommentRepository extends JpaRepository<CommentModel,String> {

}
