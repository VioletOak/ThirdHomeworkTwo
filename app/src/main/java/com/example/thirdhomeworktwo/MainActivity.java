package com.example.thirdhomeworktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Необходимо купить билеты на экскурсионную группу на автобус из Горно-
     Алтайска в Артыбаш
     Группа состоит из 9 молодых взрослых, 5 пенсионеров и 11 детей
     Автобус отправляется в 7.00 1 июня (время пути 4 часа 30 минут)
     Стоимость взрослого билета 70 монет, детский билет с 50% скидкой,
     пенсионерский билет с 30% скидкой

     Исходя из имеющихся данных нужно создать сущности билета с необходимыми
     полями для молодого взрослого, пенсионера и для ребёнка
     Затем нужно вывести общую стоимость билетов на экран приложения **/

    private TextView ticketTotal;
    private TextView childTicketOut;
    private TextView oldTicketOut;
    private TextView ticketOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ticket ticket = new Ticket( 70, 9);
        Ticket childTicket = new ChildTicket( 70, 11, 50);
        Ticket oldTicket = new OldTicket(70, 5, 30);

        ticketTotal = findViewById(R.id.totalTicket);
        childTicketOut = findViewById(R.id.childTicketOut);
        oldTicketOut = findViewById(R.id.oldTicketOut);
        ticketOut = findViewById(R.id.ticketOut);

        float overallPrice = ticket.countTicketPrice();
        float overallChildPrice = childTicket.countTicketPrice();
        float overallOldPrice = oldTicket.countTicketPrice();

        ticketOut.setText(overallPrice + " money");
        childTicketOut.setText(overallChildPrice + "  child money");
        oldTicketOut.setText(overallOldPrice + " old money");
        ticketTotal.setText((overallPrice + overallChildPrice + overallOldPrice) + " oll money");

    }
}