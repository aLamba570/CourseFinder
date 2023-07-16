package com.example.coursefinder.API;



import com.example.coursefinder.model.Category;
import com.example.coursefinder.model.Course;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;

public interface ApiInterface {

    @GET("category.json")
    Call<List<Category>> getAllCategory();

    @GET("course.json")
    Call<List<Course>> getCourseContent();
}
