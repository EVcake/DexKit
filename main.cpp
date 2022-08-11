#include <iostream>
#include <fstream>
#include <chrono>
#include <stack>
#include <map>
#include <set>
#include "dex_kit.h"
#include "code_format.h"

int main() {
    std::map<std::string, std::set<std::string>> obfuscate = {
            {"Lcom/tencent/mobileqq/activity/ChatActivityFacade;",               {"^reSendEmo"}},
            {"Lcooperation/qzone/PlatformInfor;",                                {"52b7f2", "qimei"}},
            {"Lcom/tencent/mobileqq/troop/clockin/handler/TroopClockInHandler;", {"TroopClockInHandler"}},
            {"com.tencent.widget.CustomWidgetUtil",                              {"^NEW$"}},
    };

    dexkit::DexKit dexKit("../dex/qq-8.9.2/qq-8.9.2.apk");

    auto now = std::chrono::system_clock::now();
    auto now_ms = std::chrono::duration_cast<std::chrono::milliseconds>(now.time_since_epoch());

    // 返回混淆map中包含所有字符串的类
    auto res = dexKit.LocationClasses(obfuscate, true);
//    dexKit.SetThreadNum(1);
    for (auto &[key, value]: res) {
        std::cout << key << " -> \n";
        for (auto &v: value) {
            std::cout << "\t" << v << "\n";
        }
    }

    std::vector<std::string> v;
    std::vector<size_t> p{1, 2, 3};
    auto res1 = dexKit.FindMethodInvoked("Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V",
                                         "", "", "", v, p);
    std::cout << "FindMethodInvoked -> \n";
    for (auto &value: res1) {
        std::cout << "\t" << value << "\n";
    }

    auto res2 = dexKit.FindSubClasses("Landroid/app/Activity;");
    std::cout << "FindSubClasses -> \n";
    for (auto &value: res2) {
        std::cout << "\t" << value << "\n";
    }

    std::vector<uint8_t> op_seq{0x70, 0x22, 0x70, 0x5b, 0x22, 0x70, 0x5b, 0x0e};
    auto res3 = dexKit.FindMethodOpPrefixSeq(op_seq);
    std::cout << "FindMethodOpPrefixSeq -> \n";
    for (auto &value: res3) {
        std::cout << "\t" << value << "\n";
    }

    auto now1 = std::chrono::system_clock::now();
    auto now_ms1 = std::chrono::duration_cast<std::chrono::milliseconds>(now1.time_since_epoch());
    std::cout << "used time: " << now_ms1.count() - now_ms.count() << " ms\n";
//    while (true) sleep(1);
    return 0;
}