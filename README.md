# design principle
  - đóng gói những thứ hay thay đổi
  - ưu tiên cho thanh phần hơn là kế thừa (favor composition over inheritance)
  - khi lập trình thì nghĩ đến interface chứ không phải implementations
  - các đối tượng tương tác với nhau độc lập nhất có thể
  - đừng lặp lại các đoạn code (dry - don't repeat yourself)
  - để cách giải quyết vấn đề ở mức giản thôi (kiss - keep it simple stupid)
  - chỉ implement những chức năng mà cảm thấy cần đến (yagni - Bạn có thể sẽ không cần đến nó đâu)
  - hãy giữ code được sạch đẹp hơn lúc bạn chưa chỉnh sửa nó (boy scout rule)
  - chỉ nói chuyện với bạn bè chực tiếp của bạn (lod - law of demeter)
  - chỉ làm một việc duy nhất (do one thing)

# design pattern:
  - Là một giải pháp tổng quát tái sử dụng được cho các vấn đề thông dụng
  - là một mẫu hoặc mô tả các giải quyết một vấn đề
  - một kỹ thuật đã được kiểm chứng
  - design pattern không phải là bản thiết kế hoàn chỉnh có thể dùng để chuyển hóa trực tiếp thành mã nguồn
  - là khuôn mẫu để giải quyết vấn đề trong các tình huống khác nhau
  
# phân loại:
  - createional: các đối tượng được tạo ra như thế nào?
  - structural: các đối tượng được cấu tạo thế nào?
  - behavioral: các đối tượng tương tác vơi nhau như thế nào?

# demo:
  - singleton: khi nào muốn tạo 1 đối tượng duy nhất của lớp đấy thì dùng singleton. vd: khi tạo kết nối đến csdl, đếm số lượng request
  - proxy: đưa ra một đại diện thay thế cho một đối tượng để kiểm soát quyền truy cập
  - facade: cung cấp một giao diện nhất quán cho các giao diện khác ở trong các hệ thống con
  
  

