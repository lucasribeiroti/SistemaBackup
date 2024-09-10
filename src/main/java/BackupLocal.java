package src.main.java;

public class BackupLocal implements BackupService {

    @Override
    public String backupCompleto() {
        return "Realizando backup completo local.";
    }

    @Override
    public String backupIncremental() {
        return "Realizando backup incremental local.";
    }
}