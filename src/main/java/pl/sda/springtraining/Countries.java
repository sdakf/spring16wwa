package pl.sda.springtraining;

import lombok.Getter;

@Getter
public enum Countries {
    USA("Stany"), GERMANY("Niemcy"), POLAND("Polska");

    private String plName;

    Countries(String plName) {
        this.plName = plName;
    }
}
