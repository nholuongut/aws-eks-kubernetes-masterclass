package com.nholuongut.notifications.core.services;

import com.nholuongut.notifications.core.dtos.EmailMessage;

public interface NotificationService {

	public void sendEmail(EmailMessage emailMessage);

}
