package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class simpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        String command = update.getMessage().getText();

        if (command.equals("/start")) {
            String message = "Добрый день-->\n" +
                    "\n" +
                    "благодаря этому Боту вы сможете:\n" +
                    "\n" +
                    "посмотреть отчёт о работе авто-полива - /poliv\n" +
                    "\n" +
                    "посмотреть отчёт о работе трактора - /tractor\n" +
                    "\n" +
                    "узнать о сборе урожая - /food\n" +
                    "\n" +
                    "вызов мастера в респ. Татарстан: - /master\n" +
                    "\n" +
                    "-------------------------";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
            if (command.equals("/tractor")) {
                String message = "отчёт о работе трактора : https://docs.google.com/document/d/1EKKa6S15Rs5O0Qwv-iNfoIPtb7hIPVAU8XHbSecHj1c/edit?usp=sharing";
                SendMessage response = new SendMessage();
                response.setChatId(update.getMessage().getChatId().toString());
                response.setText(message);

                try {
                    execute(response);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
                if (command.equals("/poliv")) {
                    String message = "отчёт о поливе: https://docs.google.com/document/d/10h9217RfFG91LMsl09BMj-Q0F9WXY7OE0RIxdIOmU_4/edit?usp=sharing";
                    SendMessage response = new SendMessage();
                    response.setChatId(update.getMessage().getChatId().toString());
                    response.setText(message);

                    try {
                        execute(response);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                    if (command.equals("/food")) {
                        String message = "отчёт о сборе еды ://docs.google.com/document/d/1kj1w8sJi5lKC21oSxuB5crNsXo1sPAvLrkdGgcculXs/edit?usp=sharing";
                        SendMessage response = new SendMessage();
                        response.setChatId(update.getMessage().getChatId().toString());
                        response.setText(message);

                        try {
                            execute(response);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    }
        if (command.equals("/master")) {
            String message = "вот несколько вариантов: https://www.orgpage.ru/resp-tatarstan/%D1%80%D0%B5%D0%BC%D0%BE%D0%BD%D1%82_%D1%81%D1%82%D0%B0%D0%BD%D0%BA%D0%BE%D0%B2/ ";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }
    @Override
    public String getBotUsername() {
        return "FarmDetector_bot";
    }

    @Override
    public String getBotToken() {
        return "5429855743:AAHXgphnc7TzBrYzlSxv4D6uHk6OrU7syz4";
    }
}