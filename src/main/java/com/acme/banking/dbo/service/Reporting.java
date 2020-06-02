package com.acme.banking.dbo.service;

import com.acme.banking.dbo.BranchRepository;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;

public class Reporting {
    private BranchRepository branchRepository;

    public Reporting(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    /**
     * @return Markdown report for all branches, clients, accounts
     */
    public String getReport() {
        return branchRepository.getBranches().stream()
                .map(branch -> {
                    return "# " + branch.getName() + lineSeparator() +
                            "## " + (branch.getClients().isEmpty() ? "[empty]" : "");

                })
                .collect(joining("---" + lineSeparator()));
    }
}
