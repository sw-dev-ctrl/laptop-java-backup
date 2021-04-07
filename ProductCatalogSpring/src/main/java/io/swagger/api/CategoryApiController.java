package io.swagger.api;

import io.swagger.model.Category;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-12T03:03:41.245Z")

@Controller
public class CategoryApiController implements CategoryApi {



    public ResponseEntity<List<Category>> getAllCategories(@ApiParam(value = "id of the category") @RequestParam(value = "id", required = false) String id) {
        // do some magic!
        return new ResponseEntity<List<Category>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Category>> getCategories(@ApiParam(value = "All categories inside the path",required=true ) @PathVariable("path") String path) {
        // do some magic!
        return new ResponseEntity<List<Category>>(HttpStatus.OK);
    }

}
