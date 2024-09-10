package src.main.java;

public class BackupLocal implements BackupService {

    @Override
    public void backupCompleto() {
        System.out.println("Realizando backup completo local.");
    }

    @Override
    public void backupIncremental() {
        System.out.println("Realizando backup incremental local.");
    }
}