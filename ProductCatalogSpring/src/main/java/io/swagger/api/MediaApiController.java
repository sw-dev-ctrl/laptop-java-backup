package io.swagger.api;

import io.swagger.model.Media;

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
public class MediaApiController implements MediaApi {



    public ResponseEntity<List<Media>> getMedia(@ApiParam(value = "ID of category for which you want product") @RequestParam(value = "prid", required = false) Long prid,
        @ApiParam(value = "ID of category for which you want media") @RequestParam(value = "catid", required = false) Long catid) {
        // do some magic!
        return new ResponseEntity<List<Media>>(HttpStatus.OK);
    }

    public ResponseEntity<Media> getMediaById(@ApiParam(value = "ID of media to return",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Media>(HttpStatus.OK);
    }

}
