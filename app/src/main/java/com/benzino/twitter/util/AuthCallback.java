package com.benzino.twitter.util;

import com.firebase.client.AuthData;

/**
 * Created on 3/9/16.
 *
 * @author Anas
 */
public interface  AuthCallback {
    void onSuccess(AuthData authData);
    void onError(String message);

}
