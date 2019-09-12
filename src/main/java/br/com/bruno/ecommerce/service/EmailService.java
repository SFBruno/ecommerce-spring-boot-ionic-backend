package br.com.bruno.ecommerce.service;

import org.springframework.mail.SimpleMailMessage;

import br.com.bruno.ecommerce.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido Obj);

	void sendEmail(SimpleMailMessage msg);
}
