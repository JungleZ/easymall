package cn.tedu.service;

import java.util.List;

public interface HistoryService {

    void saveHistory(String history,Long userId);

    List<String> queryMyHistory(Long userId);

    void deleteHistory(Long userId);
}
