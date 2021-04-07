package io.swagger.api;

import io.swagger.model.Product;

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
public class ProductApiController implements ProductApi {



    public ResponseEntity<List<Product>> getAllProducts(@ApiParam(value = "ID of product to return") @RequestParam(value = "name", required = false) String name,
        @ApiParam(value = "ID of product to return") @RequestParam(value = "category", required = false) String category) {
        // do some magic!
        return new ResponseEntity<List<Product>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Product>> getProductById(@ApiParam(value = "ID of product to return",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<List<Product>>(HttpStatus.OK);
    }

}
