Bài tập 1 (ex_1): Trải nghiệm kiểm thử giao diện với CantUnsee
# Student Score Analysis

Bài tập thực hành kiểm thử với JUnit - Phân tích dữ liệu điểm số học sinh.

## Mục tiêu
Dự án này bao gồm một chương trình Java đơn giản để phân tích điểm số học sinh và bộ kiểm thử đơn vị (Unit Test) sử dụng JUnit 5.

## Cấu trúc thư mục
- `src/`: Chứa mã nguồn chương trình (`StudentAnalyzer.java`)
- `test/`: Chứa mã nguồn kiểm thử (`StudentAnalyzerTest.java`)

## Tính năng
Lớp `StudentAnalyzer` cung cấp hai phương thức chính:
1. `countExcellentStudents(List<Double> scores)`: Đếm số học sinh giỏi (điểm >= 8.0). Bỏ qua điểm không hợp lệ (< 0 hoặc > 10).
2. `calculateValidAverage(List<Double> scores)`: Tính điểm trung bình của các điểm hợp lệ (0-10).

## Hướng dẫn chạy kiểm thử (Unit Test)

### Yêu cầu
- Java Development Kit (JDK) 8 trở lên.
- Thư viện JUnit 5 (org.junit.jupiter).

### Cách chạy với IDE (IntelliJ IDEA, Eclipse)
1. Mở thư mục `unit-test` bằng IDE của bạn.
2. Đánh dấu thư mục `src` là **Sources Root** và thư mục `test` là **Test Sources Root**.
3. Thêm thư viện JUnit 5.8.1 (hoặc mới hơn) vào classpath của dự án. (IDE thường sẽ gợi ý "Add JUnit to classpath" khi mở file test).
4. Mở file `test/StudentAnalyzerTest.java`.
5. Nhấn chuột phải và chọn **Run 'StudentAnalyzerTest'**.

### Cách chạy bằng dòng lệnh (Manual)
Nếu bạn đã tải các file jar của JUnit Platform Console Standalone (ví dụ: `junit-platform-console-standalone-1.9.0.jar`), bạn có thể chạy:

1. Biên dịch source:
   ```bash
   javac -d bin src/StudentAnalyzer.java
   ```
2. Biên dịch test (cần classpath tới junit jar):
   ```bash
   javac -d bin -cp "bin;path/to/junit-platform-console-standalone.jar" test/StudentAnalyzerTest.java
   ```
3. Chạy test:
   ```bash
   java -jar path/to/junit-platform-console-standalone.jar --class-path bin --scan-class-path
   ```

## Tác giả
Sinh viên thực hành: Nguyễn Khắc Tuấn Bách



