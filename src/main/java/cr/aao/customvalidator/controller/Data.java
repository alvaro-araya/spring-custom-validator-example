package cr.aao.customvalidator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Data {

    @PostMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<DataResponse> getData(@Validated @RequestBody DataInputDTO dataInput, Errors errors) {
        HttpStatus httpStatus = HttpStatus.OK;
        DataResponse dataResponse = new DataResponse();
        if (errors.hasErrors()) {
            httpStatus = HttpStatus.BAD_REQUEST;
            dataResponse.setResult("ERROR: " + errors);
        } else {
            System.out.println(dataInput);
            dataResponse.setResult("OK");
            dataResponse.setDataObject(dataInput);
        }
        return new ResponseEntity<>(dataResponse, httpStatus);
    }

}
