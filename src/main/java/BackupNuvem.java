package src.main.java;

public class BackupNuvem implements BackupService {

    @Override
    public void backupCompleto() {
        System.out.println("Realizando backup completo na nuvem.");
    }

    @Override
    public void backupIncremental() {
        System.out.println("Realizando backup incremental na nuvem.");
    }
}
