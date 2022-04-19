package com.stc.client.service;

import com.stc.client.model.Client;
import org.springframework.stereotype.Service;

/**
 * User: job
 * Date: 18/04/22
 * Time: 20:56
 *
 * @author job
 */
@Service
public class FindClientById {

    public FindClientById(){
    }
    public void execute(){
        Client  client = new Client();
        client.setId(1);
        client.setName("Erineo");
        client.setNit("124545-9");
    }
}
