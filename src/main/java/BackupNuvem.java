package src.main.java;

public class BackupNuvem implements BackupService {

    @Override
    public String backupCompleto() {
        return "Realizando backup completo na nuvem.";
    }

    @Override
    public String backupIncremental() {
        return "Realizando backup incremental na nuvem.";
    }
}