package com.wcc.javatest.javatest.dao.impl;

import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngRequest;
import com.wcc.javatest.javatest.dao.PostcodeLatLngDao;
import com.wcc.javatest.javatest.pojo.PostcodeLatLng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class PostcodeLatLngDaoImpl implements PostcodeLatLngDao {

    private static final String TABLE_NAME = "postcodelatlng";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public PostcodeLatLng getPostcode(String postcode) {
        String sql = "select postcode, latitude, longitude from " + TABLE_NAME + " where postcode=?";
        return jdbcTemplate.queryForObject(sql, postcodeLatLngMapper(), postcode);
    }

    @Override
    public boolean setPostCodeLatLng(SetPostcodeLatLngRequest request) {
        String sql = "insert into " + TABLE_NAME + "(`postcode`,`latitude`,`longitude`) values(?,?,?) on duplicate key update latitude=?,longitude=? ";
        return jdbcTemplate.update(sql,
                request.postcodeLatLng.postcode,
                request.postcodeLatLng.latitude,
                request.postcodeLatLng.longitude,
                request.postcodeLatLng.latitude,
                request.postcodeLatLng.longitude) >= 1;
    }

    private RowMapper<PostcodeLatLng> postcodeLatLngMapper() {
        return new RowMapper<PostcodeLatLng>() {
            @Override
            public PostcodeLatLng mapRow(ResultSet rs, int rownumber) throws SQLException {
                PostcodeLatLng postcodeLatLng = new PostcodeLatLng(
                        rs.getString("postcode"),
                        rs.getDouble("latitude"),
                        rs.getDouble("longitude")
                );

                return postcodeLatLng;
            }
        };
    }
}

