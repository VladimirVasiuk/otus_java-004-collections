package org.edu.domain;

import org.edu.exceptions.ClientExistsException;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.*;

public class Bank implements Serializable {

    private static final long serialVersionUID = -4157871135257285214L;
    private final Set<Client> clients = new HashSet<Client>();


    public Bank() {
    }

    public void addClient(final Client client) throws ClientExistsException {
        if (clients.contains(client)) {
            throw new ClientExistsException("Client already exists into the bank");
        }
        clients.add(client);
    }

    public Set<Client> getClients() {
        return Collections.unmodifiableSet(clients);
    }

    public Client getClient(String name) {
        for (Client client : clients)
            if (client.getName().equals(name))
                return client;
        return null;
    }

    public Collection<Account> getAccounts() {
        Collection<Account> result = new HashSet<>();
        for (Client client : clients)
            result.addAll(client.getAccounts());
        return result;
    }
}




