package service.impl;

import service.Observer;

/**
 * @author : ShEnUx
 * @time : 5:27 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class Sithum implements Observer {
    @Override
    public void update(String message) {
        System.out.println(" In Sithum's Wall :"+message);
    }
}
