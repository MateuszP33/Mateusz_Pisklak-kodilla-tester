package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertServiceTestSuite {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Client client = Mockito.mock(Client.class);
    AlertOrRegulation alert = Mockito.mock(AlertOrRegulation.class);
    AlertOrRegulation regulation = Mockito.mock(AlertOrRegulation.class);

    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);


    @Test
    public void subscribedClientShouldReceiveNotification() {
        weatherAlertService.addSubscriber(client, location1);
        weatherAlertService.sendAlert(location1, alert);
        Mockito.verify(client).receive(alert);
    }

    @Test
    public void clientShouldNotReceiveAlertFromUnsignedLocation() {
        weatherAlertService.addSubscriber(client, location1);
        weatherAlertService.addSubscriber(client, location2);
        weatherAlertService.addSubscriber(client, location3);
        weatherAlertService.removeClientSubscriptions(client, location2);
        weatherAlertService.sendAlert(location1, alert);
        weatherAlertService.sendAlert(location2, alert);
        weatherAlertService.sendAlert(location3, alert);
        Mockito.verify(client, Mockito.times(2)).receive(alert);
    }

    @Test
    public void notificationShouldNotBeSentToClientIfRemoveAllSignedLocation() {
        weatherAlertService.addSubscriber(client, location1);
        weatherAlertService.addSubscriber(client, location2);
        weatherAlertService.addSubscriber(client, location3);
        weatherAlertService.removeClientSubscriptions(client, location1);
        weatherAlertService.removeClientSubscriptions(client, location2);
        weatherAlertService.removeClientSubscriptions(client, location3);
        weatherAlertService.sendAlert(location1, alert);
        weatherAlertService.sendAlert(location2, alert);
        weatherAlertService.sendAlert(location3, alert);
        Mockito.verify(client, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        weatherAlertService.addSubscriber(client, location1);
        weatherAlertService.addSubscriber(secondClient, location1);
        weatherAlertService.addSubscriber(secondClient, location2);
        weatherAlertService.addSubscriber(thirdClient, location3);
        weatherAlertService.sendAlert(location1, alert);
        Mockito.verify(thirdClient, Mockito.never()).receive(alert);
        Mockito.verify(client).receive(alert);
        Mockito.verify(secondClient).receive(alert);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        weatherAlertService.addSubscriber(client, location1);
        weatherAlertService.addSubscriber(secondClient, location2);
        weatherAlertService.addSubscriber(thirdClient, location3);
        weatherAlertService.sendRegulation(weatherAlertService.getClientsLocation(), regulation);
        Mockito.verify(client).receive(regulation);
        Mockito.verify(secondClient).receive(regulation);
        Mockito.verify(thirdClient).receive(regulation);
    }

    @Test
    public void shouldRemoveLocationAndDoNotSendAlerts() {
        weatherAlertService.addSubscriber(client, location1);
        weatherAlertService.addSubscriber(secondClient, location2);
        weatherAlertService.addSubscriber(thirdClient, location3);
        weatherAlertService.removeLocation(location2);
        weatherAlertService.sendAlert(location1, alert);
        weatherAlertService.sendAlert(location2, alert);
        weatherAlertService.sendAlert(location3, alert);
        Mockito.verify(secondClient, Mockito.never()).receive(alert);
        Mockito.verify(client).receive(alert);
        Mockito.verify(thirdClient).receive(alert);

    }
}