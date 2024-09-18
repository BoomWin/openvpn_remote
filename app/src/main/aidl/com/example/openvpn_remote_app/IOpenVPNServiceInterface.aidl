package com.example.openvpn_remote_app;

interface IOpenVPNServiceInterface {
    void startVPN(String config);
    void stopVPN();
    boolean isVPNActive();
}